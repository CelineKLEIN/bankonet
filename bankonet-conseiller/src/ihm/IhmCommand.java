package ihm;

import java.sql.SQLException;

public abstract class IhmCommand {
	
	abstract public Integer getId();
	abstract public String getLibelle();
	abstract void execute() throws SQLException;
 
}
