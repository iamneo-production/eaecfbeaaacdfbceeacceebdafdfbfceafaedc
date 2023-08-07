package "com/examly/springapp";

import javax.persistence.GenerationType;

import lombok.Getter;
import lombok.Setter;



@javax.persistence.Entity
@Getter
@Setter
public class Task {

	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy=GenerationType.AUTO)
	private long taskId;

	@javax.persistence.Column
	private String taskHolderName;
	@javax.persistence.Column
	private String taskDate;
	@javax.persistence.Column
	private String taskName;
	@javax.persistence.Column
	private String taskStatus;
}