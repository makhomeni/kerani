/**
 * Created by ayatullah on 11/05/2015.
 */


  /*  $('.date-picker').datepicker({
        autoclose: true,
        todayHighlight: true
    })
        .next().on(ace.click_event, function () {
            $(this).prev().focus();
        });
*/



function clearErrMsg() {
    $('.errMsg').html("");
}


function ibblProgressBar(title) {
    $('#ibcsProgressModal').modal('show');
    $('#progressModalTitle').html(title);
}
function hideIbblProgressBar() {
    $('#ibcsProgressModal').modal('hide');
}

function ibblConfirmAlert(msg, action) {
    $('#ibcs-confirm-alert').modal('show');
    $('#ibcs-confirm-alert-msg').html(msg);
    $('#ibcs-confirm-alert-yes').attr("action", action);
}

function ibblRemarksAlert(remarksFor, title){
    $('#ibcs-modal-remarks-text').attr("remarks-for", remarksFor);
    $('#ibcs-remarks-title').html(title);
    $('#ibcs-remarks-pull-box').modal("show");
}
function hideIbblRemarksAlert(){
    $('#ibcs-remarks-pull-box').modal("hide");
}

function ibblAlert(type, head, body) {
    $('#alertModal-' + type).modal('show');
    $('#alert-' + type + '-title').html(head);
    $('#alert-' + type + '-body').html(body);
}

function ibblSAlert(head, body) {
    $('#alertModal-success').modal('show');
    if (head == "")
        $('#alert-success-title').html('Success !');
    else
        $('#alert-success-title').html(head);
    $('#alert-success-body').html(body);
}
function ibblWAlert(head, body) {
    $('#alertModal-warning').modal('show');
    if (head == "")
        $('#alert-warning-title').html('Warning !');
    else
        $('#alert-warning-title').html(head);
    $('#alert-warning-body').html(body);
}
function ibblDAlert(head, body) {
    $('#alertModal-danger').modal('show');
    if (head == "")
        $('#alert-danger-title').html('Attention !');
    else
        $('#alert-danger-title').html(head);
    $('#alert-danger-body').html(body);
}

function ibblGAlert(body) {
    $('#ibcsGeneralAlertModal').modal('show');
    $('#alert-general-body').html(body);
}

function hideIbblAlert() {
    $('.ibcsAlert').modal('hide');
}


