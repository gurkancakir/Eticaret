$ ->
  $.get "/categories", (categories) ->
    $.each categories, (index, category) ->
      if category.parentId is null
        $.get "/categories/#{category.id}", (subcategories) ->
          if subcategories.length is 0
            $('#accordian').append "<div class='panel panel-default'><div class='panel-heading'><h4 class='panel-title'><a href='#'>#{category.name}</a></h4></div></div>"
          else
            console.log "yok #{category.name}"
            $('#accordian').append "<div class='panel panel-default'><div class='panel-heading'><h4 class='panel-title'><a data-toggle='collapse' data-parent='#accordian' href='##{category.name}'><span class='badge pull-right'><i class='fa fa-plus'></i></span>#{category.name}</a></h4></div><div id='#{category.name}' class='panel-collapse collapse'><div class='panel-body'><ul></ul></div></div>"
            $.each subcategories, (index,subcategory) ->
              $('#'+category.name+' ul').append  "<li><a href='#'>#{subcategory.name}</a></li>"