package net.softengine.security.model;



import net.softengine.util.SEEncDec;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "SEC_TOKEN", uniqueConstraints= @UniqueConstraint(columnNames={"username"}))
public class Token implements Serializable {
	
	
	private static final long serialVersionUID = -2020752748932592756L;

	@Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

	private String username;
	private String password;


    @OneToOne(mappedBy = "token")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
        SEEncDec IBBLEncDec = new SEEncDec(this.username);
        password = IBBLEncDec.decrypt(password);
		return password;
	}
	public void setPassword(String password) {
        SEEncDec IBBLEncDec = new SEEncDec(this.username);
        this.password = IBBLEncDec.encrypt(password);
	}



}
