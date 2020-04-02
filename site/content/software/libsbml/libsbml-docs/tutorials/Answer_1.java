import org.sbml.libsbml.*;


/*
 * @file    answer_1.java
 * @brief   Solution to tutorial example exercise 1
 * @author  Sarah Keating
 * @author  Frank Bergmann (java port)
 */

public class answer_1 {

	public static void main(String[] args) {

		System.loadLibrary("sbmlj");

		if (args.length != 1)
		{
			System.out.println("Usage: answer_1 input-filename");
			System.exit(2);
		}

		SBMLDocument d = libsbml.readSBML(args[0]);
		if ( d.getNumErrors() > 0)
		{
			d.printErrors();
		}
		else
		{
			Model  m = d.getModel();
			Species s;
			for (int n = 0; n < m.getNumReactions(); n++)
			{
				Reaction r = m.getReaction(n);
				// print reaction id
				System.out.print("Reaction " + r.getId() + ": ");

				// look at reactants
				int numReactants = (int)r.getNumReactants();
				if (numReactants > 1)
				{
					s = m.getSpecies(r.getReactant(0).getSpecies());
					System.out.print(s.getName() + " ");
					for (int k = 1; k < numReactants; k++)
					{
						// get species referred to by the reaction
						s = m.getSpecies(r.getReactant(k).getSpecies());
						System.out.print("+ " + s.getName() + " ");
					}
				}
				else if (numReactants == 1)
				{
					// get species referred to by the reaction
					s = m.getSpecies(r.getReactant(0).getSpecies());
					System.out.print(s.getName() + " ");
				}
				if (r.getReversible() == true)
				{
					System.out.print("<=> ");
				}
				else
				{
					System.out.print("=> ");
				}
				// look at products
				int numProducts = (int)r.getNumProducts();
				if (numProducts > 1)
				{
					s = m.getSpecies(r.getProduct(0).getSpecies());
					System.out.print(s.getName() + " ");
					for (int k = 1; k < numProducts; k++)
					{
						// get species referred to by the reaction
						s = m.getSpecies(r.getProduct(k).getSpecies());
						System.out.print("+ " + s.getName() + " ");
					}
				}
				else if (numProducts == 1)
				{
					// get species referred to by the reaction
					s = m.getSpecies(r.getProduct(0).getSpecies());
					System.out.print(s.getName() + " ");
				}

				System.out.println("\n");

			}

		}


	}

}
