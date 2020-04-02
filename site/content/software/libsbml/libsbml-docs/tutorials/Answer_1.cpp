/**
 * @file    answer_1.cpp
 * @brief   Solution to tutorial example exercise 1
 * @author  Sarah Keating
 */


#include <iostream>
#include <sstream>

#include <sbml/SBMLTypes.h>


using namespace std;
LIBSBML_CPP_NAMESPACE_USE

int
main (int argc, char* argv[])
{
  if (argc != 2)
  {
    cout << endl << "Usage: answer_1 input-filename"
         << endl << endl;
    return 2;
  }

  SBMLDocument *d = readSBML(argv[1]);
  if ( d->getNumErrors() > 0)
  {
    d->printErrors();
  }
  else
  {
    Model * m = d->getModel();
    Species *s;
    for (unsigned int n = 0; n < m->getNumReactions(); n++)
    {
      Reaction* r = m->getReaction(n);
      // print reaction id
      cout << "Reaction " << r->getId() << ": ";
      
      // look at reactants
      unsigned int numReactants = r->getNumReactants();
      if (numReactants > 1)
      {
        s = m->getSpecies(r->getReactant(0)->getSpecies());
        cout << s->getName() << " ";
       for (unsigned int k = 1; k < numReactants; k++)
        {
          // get species referred to by the reaction
          Species *s = m->getSpecies(r->getReactant(k)->getSpecies());
          cout << "+ " << s->getName() << " ";
        }
      }
      else if (numReactants == 1)
      {
        // get species referred to by the reaction
        s = m->getSpecies(r->getReactant(0)->getSpecies());
        cout << s->getName() << " ";
      }
      if (r->getReversible() == true)
      {
        cout << "<=> ";
      }
      else
      {
        cout << "=> ";
      }
      // look at products
      unsigned int numProducts = r->getNumProducts();
      if (numProducts > 1)
      {
        s = m->getSpecies(r->getProduct(0)->getSpecies());
        cout << s->getName() << " ";
       for (unsigned int k = 1; k < numProducts; k++)
        {
          // get species referred to by the reaction
          Species *s = m->getSpecies(r->getProduct(k)->getSpecies());
          cout << "+ " << s->getName() << " ";
        }
      }
      else if (numProducts == 1)
      {
        // get species referred to by the reaction
        s = m->getSpecies(r->getProduct(0)->getSpecies());
        cout << s->getName() << " ";
      }

      cout << endl << endl;

    }

  }

  return 0;
}

