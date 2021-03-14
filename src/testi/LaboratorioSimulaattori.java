package testi;
import simu.framework.*;
import eduni.distributions.Normal;
import eduni.distributions.Uniform;
import simu.framework.Trace.Level;
import simu.model.OmaMoottori;

public class LaboratorioSimulaattori {

	public static void main(String[] args) {
	
		for(int i=0;i<1000;i++) {
			Uniform ui = new Uniform(1, 2);
			double luku = (ui.sample());
			System.out.println(luku);
		}
	}

}
