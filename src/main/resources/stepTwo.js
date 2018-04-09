var stepTwo = (function($, window, document){
    var haveInit = false;
    var wareProductList = $("#wareProductList");
    var _stepTwo = $("#container-step-two");

    var getData = function(){

    };

    var getJdCategoryList = function(cate_object_id, fid) {

    };

    var getPage = function(){

    };

    var getSelectWareData = function(){

    }

    var dataListen = function(){

    };

    var listen = function(){


        var resetCascadeNext = function (cate_id) {

        };

        var resetCascadeSelect = function(cate_id){

        };

        var getJdCategorySelectChange = function(cate_first_id, cate_second_id){

        };

        _stepTwo.find("[role='cascade-select']").each(function(){

        });

        _stepTwo.find("#btn_next_step").on("click", function(){

        });

        _stepTwo.find("#btn_last_step").on("click", function(){

        });
    };

    var fillData = function (){

    };

    var init = function(){
        if(!haveInit){
            _stepTwo.find("[role='cascade-select']:first").each(function(){
                getJdCategoryList(this, 0);
            });
            listen();
            haveInit = true;
        }
        fillData();
    };

    //分页相关
    var goPage = function(page){

    };

    var goToAjaxPage = function() {

    };

    return {
      init : init,
      goPage : goPage,
      goToAjaxPage : goToAjaxPage
    };
})($, window, document);