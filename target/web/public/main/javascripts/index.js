(function() {
  $(function() {
    return $.get("/categories", function(categories) {
      return $.each(categories, function(index, category) {
        if (category.parentId === null) {
          return $.get("/categories/" + category.id, function(subcategories) {
            if (subcategories.length === 0) {
              return $('#accordian').append("<div class='panel panel-default'><div class='panel-heading'><h4 class='panel-title'><a href='#'>" + category.name + "</a></h4></div></div>");
            } else {
              console.log("yok " + category.name);
              $('#accordian').append("<div class='panel panel-default'><div class='panel-heading'><h4 class='panel-title'><a data-toggle='collapse' data-parent='#accordian' href='#" + category.name + "'><span class='badge pull-right'><i class='fa fa-plus'></i></span>" + category.name + "</a></h4></div><div id='" + category.name + "' class='panel-collapse collapse'><div class='panel-body'><ul></ul></div></div>");
              return $.each(subcategories, function(index, subcategory) {
                return $('#' + category.name + ' ul').append("<li><a href='#'>" + subcategory.name + "</a></li>");
              });
            }
          });
        }
      });
    });
  });

}).call(this);

//# sourceMappingURL=index.js.map
