function openNav() {
    $('#side-nav').width('250px');
    $(document.body).css('background-color', 'rgba(0,0,0,0.5)');
    $('#side-nav').css('box-shadow', '0px 8px 16px 3px rgba(0,0,0,0.2)');
}

function closeNav() {
    $('#side-nav').width('0px');
    $(document.body).css('background-color', 'white');
    $('#side-nav').css('box-shadow', '0px 0px 0px 0px rgba(0,0,0,0.2)')
}