/**
 * �A�N�V�������Ăяo�����ʃ��\�b�h
 * @param form
 * @param operation
 * @returns
 */
function callAction(form, operation) {
	form.operation.value = operation;
	var msg = null;
	if (operation == "insert") {
		msg = "�o�^���Ă���낵���ł����H";
	} else if (operation == "update") {
		msg = "�X�V���Ă���낵���ł����H";
	} else if (operation == "delete") {
		msg = "�폜���Ă���낵���ł����H";
	}
	if (msg != null && !confirm(msg)) {
		return;
	}
	form.submit();
}