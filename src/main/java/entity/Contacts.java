package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contacts {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private BigInteger number;
	private String message;

}
