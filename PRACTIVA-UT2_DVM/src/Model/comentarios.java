package Model;

public  class comentarios {
private String nick;
private String coment;

public comentarios(String nick,String coment) {
this.nick=nick;
this.coment=coment;
}

public String getNick() {
	return nick;
}

public void setNick(String nick) {
	this.nick = nick;
}

public String getComent() {
	return coment;
}

public void setComent(String coment) {
	this.coment = coment;
}
}
