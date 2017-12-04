document.addEventListener("DOMContentLoaded", function () {
    var xhr = new XMLHttpRequest();

    xhr.open('GET', '/greeting', true);

    xhr.setRequestHeader('Accept', '*/*');

    xhr.onreadystatechange = function () {
        if (xhr.readyState !== 4){
            return;
        }

        if (xhr.status !== 200){
            alert(xhr.status + ': ' + xhr.statusText);
        } else {
            alert(xhr.responseText);
        }
    };

    xhr.send();
});