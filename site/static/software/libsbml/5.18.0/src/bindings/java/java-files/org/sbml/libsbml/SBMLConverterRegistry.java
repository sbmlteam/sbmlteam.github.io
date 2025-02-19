/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  Registry of all libSBML SBML converters.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  It is a class used in
the implementation of extra functionality provided by libSBML.
</p>

 <p>
 * LibSBML provides facilities for transforming and converting SBML
 * documents in various ways.  These transformations can involve
 * essentially anything that can be written algorithmically; examples
 * include converting the units of measurement in a model, or converting
 * from one Level+Version combination of SBML to another.  Converters are
 * implemented as objects derived from the class {@link SBMLConverter}.
 <p>
 * The converter registry, implemented as a singleton object of class
 * {@link SBMLConverterRegistry}, maintains a list of known converters and provides
 * methods for discovering them.  Callers can use the method
 * {@link SBMLConverterRegistry#getNumConverters()} to find out how many
 * converters are registered, then use
 * {@link SBMLConverterRegistry#getConverterByIndex(int)} to
 * iterate over each one; alternatively, callers can use
 * {@link SBMLConverterRegistry#getConverterFor(ConversionProperties)}
 * to search for a converter having specific properties.
 */

public class SBMLConverterRegistry {
   private long swigCPtr;
   protected boolean swigCMemOwn;

   protected SBMLConverterRegistry(long cPtr, boolean cMemoryOwn)
   {
     swigCMemOwn = cMemoryOwn;
     swigCPtr    = cPtr;
   }

   protected static long getCPtr(SBMLConverterRegistry obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (SBMLConverterRegistry obj)
   {
     long ptr = 0;

     if (obj != null)
     {
       ptr             = obj.swigCPtr;
       obj.swigCMemOwn = false;
     }

     return ptr;
   }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsbmlJNI.delete_SBMLConverterRegistry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  
/**
   * Returns the singleton instance for the converter registry.
   <p>
   * Prior to using the registry, callers have to obtain a copy of the
   * registry.  This static method provides the means for doing that.
   <p>
   * @return the singleton for the converter registry.
   */ public
 static SBMLConverterRegistry getInstance() {
    return new SBMLConverterRegistry(libsbmlJNI.SBMLConverterRegistry_getInstance(), false);
  }

  
/**
   * Adds the given converter to the registry of SBML converters.
   <p>
   * @param converter the converter to add to the registry.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   * </ul>
   */ public
 int addConverter(SBMLConverter converter) {
    return libsbmlJNI.SBMLConverterRegistry_addConverter(swigCPtr, this, SBMLConverter.getCPtr(converter), converter);
  }

  
/**
   * Returns the converter with the given index number.
   <p>
   * Converters are given arbitrary index numbers by the registry.  Callers
   * can use the method {@link SBMLConverterRegistry#getNumConverters()} to find
   * out how many converters are registered, then use this method to
   * iterate over the list and obtain each one in turn.
   <p>
   * @param index the zero-based index of the converter to fetch.
   <p>
   * @return the converter with the given index number, or <code>null</code> if the
   * number is less than <code>0</code> or there is no converter at the given index
   * position.
   */ public
 SBMLConverter getConverterByIndex(int index) {
	return libsbml.DowncastSBMLConverter(libsbmlJNI.SBMLConverterRegistry_getConverterByIndex(swigCPtr, this, index), false);
}

  
/**
   * Returns the converter that best matches the given configuration
   * properties.
   <p>
   * Many converters provide the ability to configure their behavior.  This
   * is realized through the use of <em>properties</em> that offer different 
   * <em>options</em>.  The present method allows callers to search for converters
   * that have specific property values.  Callers can do this by creating a
   * {@link ConversionProperties} object, adding the desired option(s) to the
   * object, then passing the object to this method.
   <p>
   * @param props a {@link ConversionProperties} object defining the properties
   * to match against.
   <p>
   * @return the converter matching the properties, or <code>null</code> if no
   * suitable converter is found.
   <p>
   * @see #getConverterByIndex(int)
   */ public
 SBMLConverter getConverterFor(ConversionProperties props) {
	return libsbml.DowncastSBMLConverter(libsbmlJNI.SBMLConverterRegistry_getConverterFor(swigCPtr, this, ConversionProperties.getCPtr(props), props), false);
}

  
/**
   * Returns the number of converters known by the registry.
   <p>
   * @return the number of registered converters.
   <p>
   * @see #getConverterByIndex(int)
   */ public
 int getNumConverters() {
    return libsbmlJNI.SBMLConverterRegistry_getNumConverters(swigCPtr, this);
  }

}
