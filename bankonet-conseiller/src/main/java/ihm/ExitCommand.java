package ihm;

public class ExitCommand extends IhmCommand{

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getLibelle() {
		// TODO Auto-generated method stub
		return "Arr�t du programme";
	}

	@Override
	void execute() {
		// TODO Auto-generated method stub
		System.out.println("arr�t du programme");
		System.exit(0);
	}

}
