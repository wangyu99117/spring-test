var secKillStep = (function($, window, document){

    var lastStep = function(){
        var $curStep = $(".fe-step-box").children(".fe-step-curr");
        var $lastStep = $curStep.prev();
        if($lastStep.size() > 0){
            $curStep.removeClass("fe-step-curr");
            $lastStep.addClass("fe-step-curr");
            $lastStep.removeClass("fe-step-done");
        }
    };

    var  nextStep = function(){
        var $curStep = $(".fe-step-box").children(".fe-step-curr");
        var $nextStep = $curStep.next();
        if($nextStep.size() > 0){
            $curStep.removeClass("fe-step-curr");
            $nextStep.addClass("fe-step-curr");
            $curStep.addClass("fe-step-done");
        }else{
            console("secKillStep error!");
        }
    };

    return {
        nextStep : nextStep,
        lastStep : lastStep
    };
})($, window, document);