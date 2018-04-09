/**
 * Created by wangyu on 2017/1/21.
 */
var stepThree = (function($, window, document){
    var haveInit = false;

    var _stepThree = $("#container-step-three");

    var _wareContainer = _stepThree.find("#step-three-wareContainer");

    var _batchContainer  = _stepThree.find("#step-three-batch-info");

    var getData = function(result) {

    };

    var setAllInputTextValue = function(obj) {

    };

    var checkSkuQualification = function(skuId) {

    };

    var selectedWareQuery_listen = function(){

    };

    var selectedSkuList = function (result) {

    };

    var fillSkuApplyData = function(data, index, skuInfo) {

    };

    var parseApplyData = function(skuMap) {

    };

    var checkApplyDataValid = function(){

    };

    /**
     * 为每个sku附加上返利相关信息
     * @param formSetList
     * @returns {*}
     */
    var buildSkuRebate = function(formSetList) {

    };

    var buildSkuInfo = function(skuId,wareId) {

    };

    var createErrorMsg = function(data) {

    };

    var applyWare = function(){

    };

    var listen = function(){
        _stepThree.find("#btn_ware_apply").on("click", function(){
            applyWare();
        });

        _stepThree.find("#btn_last_step").on("click", function(){
            $("#container-step-two").show();
            secKillStep.lastStep();
            $("#step-three-wareContainer").empty();
            $("#step-three-batch-info").empty();
            $("#container-step-three").hide();
        });
    };

    var loadBatchInfo = function(result){

    };

    //第二步选中的商品信息传过来
    var init = function(selectWareJson){
        if(!haveInit){
            listen();
            haveInit = true;
        }

        //加载批次收费信息
        loadBatchInfo(selectWareJson);
        selectedSkuList(selectWareJson);
    };

    return {
        init : init
    };
})($, window, document);