window.fbAsyncInit = function() {
    FB.init({
      appId            : 'your-app-id',
      autoLogAppEvents : true,
      xfbml            : true,
      version          : 'v7.0'
    });
  };

var finished_rendering = function() {
		  console.log("finished rendering plugins");
		  var spinner = document.getElementById("spinner");
		  spinner.removeAttribute("style");
		  spinner.removeChild(spinner.childNodes[0]);
		}
FB.Event.subscribe('xfbml.render', finished_rendering);


function onSuccess(googleUser) {
    console.log('Logged in as: ' + googleUser.getBasicProfile().getName());
  }
  function onFailure(error) {
    console.log(error);
  }
  function renderButton() {
    gapi.signin2.render('my-signin2', {
      'scope': 'profile email',
      'width': 240,
      'height': 50,
      'longtitle': true,
      'theme': 'dark',
      'onsuccess': onSuccess,
      'onfailure': onFailure
    });
  }