// <![CDATA[
	window.addEventListener('load', function() {

        $(".menu_active >li>a[href='" + location.pathname + "']").parent().addClass("active").each(function() {

            $(".menu_active >li>a[href='" + $(this).attr("href") + "']").parent().addClass("active")

        });
    });
$(function() {

  // Slider
  $('#coin-slider').coinslider({width:935,height:307,opacity:1});

  // Radius Box
  $('p.infopost').css({"border-radius":"6px", "-moz-border-radius":"6px", "-webkit-border-radius":"6px"});
  $('.searchform, .content .sidebar .gadget').css({"border-radius":"8px", "-moz-border-radius":"8px", "-webkit-border-radius":"8px"});
  //$('.content .sidebar .gadget, .fbg_resize').css({"border-radius":"12px", "-moz-border-radius":"12px", "-webkit-border-radius":"12px"});
  //$('.content p.pages span, .content p.pages a').css({"border-radius":"16px", "-moz-border-radius":"16px", "-webkit-border-radius":"16px"});
  //$('.menu_nav').css({"border-bottom-left-radius":"16px", "border-bottom-right-radius":"16px", "-moz-border-radius-bottomleft":"16px", "-moz-border-radius-bottomright":"16px", "-webkit-border-bottom-left-radius":"16px", "-webkit-border-bottom-right-radius":"16px"});

});	