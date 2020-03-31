/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-multi"><a href="group__multi.html">multi</a></span>
 Defines a set of {@link SpeciesFeature} objects.
 <p>
 * The {@link SubListOfSpeciesFeatures} object is an optional child of the
 * {@link ListOfSpeciesFeatures} list child of the extended {@link Species} (via the
 * {@link MultiSpeciesPlugin} object).  Listed alongside its sibling {@link SpeciesFeature}
 * objects, it allows the user to define a set of two or more {@link SpeciesFeature}
 * elements that have a logical relationship with each other.  This
 * relationship is defined by the 'relation' attribute, which is an
 * enumeration of values representing 'and', 'or', 'not'.  (An 'unknown'
 * option is provided here for incomplete models, but cannot be used in a
 * valid SBML document.)  The following constants represent the values:
 * {@link libsbmlConstants#MULTI_RELATION_AND MULTI_RELATION_AND},
 * {@link libsbmlConstants#MULTI_RELATION_OR MULTI_RELATION_OR},
 * {@link libsbmlConstants#MULTI_RELATION_NOT MULTI_RELATION_NOT}, and
 * {@link libsbmlConstants#MULTI_RELATION_UNKNOWN MULTI_RELATION_UNKNOWN}.
 * If any {@link SpeciesFeature} involved in a {@link SubListOfSpeciesFeatures} references a
 * {@link SpeciesFeatureType} with an 'occur' attribute greater than 1, the
 * {@link SubListOfSpeciesFeatures} can only have the value 'and' for its relation
 * attribute.
 */

public class SubListOfSpeciesFeatures extends ListOf {
   private long swigCPtr;

   protected SubListOfSpeciesFeatures(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.SubListOfSpeciesFeatures_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(SubListOfSpeciesFeatures obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (SubListOfSpeciesFeatures obj)
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
        libsbmlJNI.delete_SubListOfSpeciesFeatures(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link SubListOfSpeciesFeatures} object.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 SubListOfSpeciesFeatures(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SubListOfSpeciesFeatures__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link SubListOfSpeciesFeatures} object.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 SubListOfSpeciesFeatures(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SubListOfSpeciesFeatures__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link SubListOfSpeciesFeatures} object.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 SubListOfSpeciesFeatures(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SubListOfSpeciesFeatures__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link SubListOfSpeciesFeatures} object.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 SubListOfSpeciesFeatures() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SubListOfSpeciesFeatures__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link SubListOfSpeciesFeatures} with the given {@link MultiPkgNamespaces}
   * object.
   <p>
   * <p>
 * The package namespaces object used in this constructor is derived from a
 * {@link SBMLNamespaces} object, which encapsulates SBML Level/Version/namespaces
 * information.  It is used to communicate the SBML Level, Version, and 
 * package version and name information used in addition to SBML Level&nbsp;3 Core.  A
 * common approach to using libSBML's {@link SBMLNamespaces} facilities is to create an
 * package namespace object somewhere in a program once, then hand that object
 * as needed to object constructors of that package that accept it as and
 * argument, such as this one.
   <p>
   * @param multins the {@link MultiPkgNamespaces} object
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 SubListOfSpeciesFeatures(MultiPkgNamespaces multins) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SubListOfSpeciesFeatures__SWIG_4(MultiPkgNamespaces.getCPtr(multins), multins), true);
  }

  
/**
   * Creates and return a copy of {@link SubListOfSpeciesFeatures}.
   <p>
   * @param orig this {@link SubListOfSpeciesFeatures} object
   */ public
 SubListOfSpeciesFeatures(SubListOfSpeciesFeatures orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SubListOfSpeciesFeatures__SWIG_5(SubListOfSpeciesFeatures.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link SubListOfSpeciesFeatures} object.
   <p>
   * @return a (deep) copy of this {@link SubListOfSpeciesFeatures} object.
   */ public
 SubListOfSpeciesFeatures cloneObject() {
    long cPtr = libsbmlJNI.SubListOfSpeciesFeatures_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new SubListOfSpeciesFeatures(cPtr, true);
  }

  
/**
   * Returns the value of the 'id' attribute of this {@link SubListOfSpeciesFeatures}.
   <p>
   * @return the value of the 'id' attribute of this {@link SubListOfSpeciesFeatures} as a string.
   */ public
 String getId() {
    return libsbmlJNI.SubListOfSpeciesFeatures_getId(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> or <code>false</code> depending on whether this
   * {@link SubListOfSpeciesFeatures}'s 'id' attribute has been set.
   <p>
   * @return <code>true</code> if this {@link SubListOfSpeciesFeatures}'s 'id' attribute has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetId() {
    return libsbmlJNI.SubListOfSpeciesFeatures_isSetId(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'id' attribute of this {@link SubListOfSpeciesFeatures}.
   <p>
   * @param id String value of the 'id' attribute to be set
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setId(String id) {
    return libsbmlJNI.SubListOfSpeciesFeatures_setId(swigCPtr, this, id);
  }

  
/**
   * Unsets the value of the 'id' attribute of this {@link SubListOfSpeciesFeatures}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetId() {
    return libsbmlJNI.SubListOfSpeciesFeatures_unsetId(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'name' attribute of this
   * {@link SubListOfSpeciesFeatures}.
   <p>
   * @return the value of the 'name' attribute of this
   * {@link SubListOfSpeciesFeatures} as a string.
   */ public
 String getName() {
    return libsbmlJNI.SubListOfSpeciesFeatures_getName(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link SubListOfSpeciesFeatures}'s 'name' attribute has
   * been set.
   <p>
   * @return <code>true</code> if this {@link SubListOfSpeciesFeatures}' 'name' attribute has
   * been set, otherwise <code>false</code> is returned.
   */ public
 boolean isSetName() {
    return libsbmlJNI.SubListOfSpeciesFeatures_isSetName(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'name' attribute of this {@link SubListOfSpeciesFeatures}.
   <p>
   * @param name the new value for the attribute.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setName(String name) {
    return libsbmlJNI.SubListOfSpeciesFeatures_setName(swigCPtr, this, name);
  }

  
/**
   * Unsets the value of the 'name' attribute of this
   * {@link SubListOfSpeciesFeatures}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetName() {
    return libsbmlJNI.SubListOfSpeciesFeatures_unsetName(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'component' attribute of this
   * {@link SubListOfSpeciesFeatures}.
   <p>
   * @return the value of the 'component' attribute of this
   * {@link SubListOfSpeciesFeatures} as a string.
   */ public
 String getComponent() {
    return libsbmlJNI.SubListOfSpeciesFeatures_getComponent(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link SubListOfSpeciesFeatures}'s 'component' attribute
   * has been set.
   <p>
   * @return <code>true</code> if this {@link SubListOfSpeciesFeatures}'s 'component' attribute
   * has been set; otherwise, <code>false</code> is returned.
   */ public
 boolean isSetComponent() {
    return libsbmlJNI.SubListOfSpeciesFeatures_isSetComponent(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'component' attribute of this
   * {@link SubListOfSpeciesFeatures}.
   <p>
   * @param component the new value for the attribute.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setComponent(String component) {
    return libsbmlJNI.SubListOfSpeciesFeatures_setComponent(swigCPtr, this, component);
  }

  
/**
   * Unsets the value of the 'component' attribute of this
   * {@link SubListOfSpeciesFeatures}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetComponent() {
    return libsbmlJNI.SubListOfSpeciesFeatures_unsetComponent(swigCPtr, this);
  }

  
/**
   * Creates a new {@link SpeciesFeature} object and adds it to this
   * {@link SubListOfSpeciesFeatures} object.
   <p>
   * @return the newly created {@link SpeciesFeature} object.
   */ public
 SpeciesFeature createSpeciesFeature() {
    long cPtr = libsbmlJNI.SubListOfSpeciesFeatures_createSpeciesFeature(swigCPtr, this);
    return (cPtr == 0) ? null : new SpeciesFeature(cPtr, false);
  }

  
/**
   * Get the nth {@link SpeciesFeature} object from the {@link SubListOfSpeciesFeatures}.
   <p>
   * @param n the index number of the {@link SpeciesFeature} to get.
   <p>
   * @return the nth object, or <code>null</code> if the index <code>is</code> out of range.
   <p>
   * @see #size()
   */ public
 SBase get(long n) {
    long cPtr = libsbmlJNI.SubListOfSpeciesFeatures_get__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new SpeciesFeature(cPtr, false);
  }

  
/**
   * Get the {@link SpeciesFeature} object with the given identifier <code>sid</code>.
   <p>
   * @param sid a string representing the identifier
   * of the {@link SpeciesFeature} to get.
   <p>
   * @return the object with the given id, or <code>null</code> if no such object exists.
   <p>
   * @see #get(long n)   *
   * @see #size()
   */ public
 SpeciesFeature get(String sid) {
    long cPtr = libsbmlJNI.SubListOfSpeciesFeatures_get__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new SpeciesFeature(cPtr, false);
  }

  
/**
   * Removes the nth {@link SpeciesFeature} object from this
   * {@link SubListOfSpeciesFeatures}.
   <p>
   * @param n the index of the {@link SpeciesFeature} to remove.
   <p>
   * @return the object removed, or <code>null</code> if no such object exists.  Note that
   * the caller owns the returned object and is responsible for deleting it.
   <p>
   * @see #size()
   */ public
 SBase remove(long n) {
    long cPtr = libsbmlJNI.SubListOfSpeciesFeatures_remove__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new SpeciesFeature(cPtr, true);
  }

  
/**
   * Removes the {@link SpeciesFeature} object with the given identifier <code>sid</code>.
   <p>
   * @param sid the identifier of the {@link SpeciesFeature} to remove.
   <p>
   * @return the object removed, or <code>null</code> if no such object exists.  Note that
   * the caller owns the returned object and is responsible for deleting it.
   */ public
 SpeciesFeature remove(String sid) {
    long cPtr = libsbmlJNI.SubListOfSpeciesFeatures_remove__SWIG_1(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new SpeciesFeature(cPtr, true);
  }

  
/**
   * Returns the value of the 'relation' attribute of this
   * {@link SubListOfSpeciesFeatures}.
   <p>
   * @return the value of the 'relation' attribute of this
   * {@link SubListOfSpeciesFeatures} as a FIX ME.
   */ public
 int getRelation() {
    return libsbmlJNI.SubListOfSpeciesFeatures_getRelation(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link SubListOfSpeciesFeatures}'s 'relation' attribute
   * has been set.
   <p>
   * @return <code>true</code> if this {@link SubListOfSpeciesFeatures}'s 'relation' attribute
   * has been set; otherwise, <code>false</code> is returned.
   */ public
 boolean isSetRelation() {
    return libsbmlJNI.SubListOfSpeciesFeatures_isSetRelation(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'relation' attribute of this {@link SubListOfSpeciesFeatures}.
   <p>
   * @param relation FIX ME value of the 'relation' attribute to be set
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setRelation(int relation) {
    return libsbmlJNI.SubListOfSpeciesFeatures_setRelation__SWIG_0(swigCPtr, this, relation);
  }

  
/**
   * Sets the value of the 'relation' attribute of this
   * {@link SubListOfSpeciesFeatures}.
   <p>
   * @param relation String& of the 'relation' attribute to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   *
   * </ul> <p>
   * <p>
 * The attribute 'relation' on a {@link SubListOfSpeciesFeatures} object is used to
 * define the logic relationship among its children.  If any {@link SpeciesFeature}
 * involved in a {@link SubListOfSpeciesFeatures} references a {@link SpeciesFeatureType} with 
 * occur > 1, the {@link SubListOfSpeciesFeatures} can only have the value 'and' for its
 * relation attribute.
 <p>
 * In the SBML
 * Level&nbsp;3 Version&nbsp;1 Multi specification, the following are the
 * allowable values for 'relation':
 * <ul>
 * <li> <code>'and'</code>, means that the species features all apply.
 <p>
 * <li> <code>'or'</code>, means that at least one of the species features apply.
 <p>
 * <li> <code>'not'</code>, means that the species feature must not apply.
 <p>
 * </ul>
   */ public
 int setRelation(String relation) {
    return libsbmlJNI.SubListOfSpeciesFeatures_setRelation__SWIG_1(swigCPtr, this, relation);
  }

  
/**
   * Unsets the value of the 'relation' attribute of this {@link SubListOfSpeciesFeatures}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetRelation() {
    return libsbmlJNI.SubListOfSpeciesFeatures_unsetRelation(swigCPtr, this);
  }

  
/**
   * Returns the XML element name of this object.
   <p>
   * @return the name of this element, i.e. <code>'subListOfSpeciesFeatures'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.SubListOfSpeciesFeatures_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this SBML object.
   <p>
   * <p>
 * LibSBML attaches an identifying code to every kind of SBML object.  These
 * are integer constants known as <em>SBML type codes</em>.  The names of all
 * the codes begin with the characters <code>SBML_</code>.
 * In the Java language interface for libSBML, the
 * type codes are defined as static integer constants in the interface class
 * {@link libsbmlConstants}.    Note that different Level&nbsp;3
 * package plug-ins may use overlapping type codes; to identify the package
 * to which a given object belongs, call the 
 * <code>{@link SBase#getPackageName()}
 * </code>
 * method on the object.
 <p>
 * The exception to this is lists:  all SBML-style list elements have the type 
 * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF}, regardless of what package they 
 * are from.
   <p>
   * @return the SBML type code for this object:
   * {@link libsbmlConstants#SBML_MULTI_BINDING_SITE_SPECIES_TYPE SBML_MULTI_BINDING_SITE_SPECIES_TYPE}.
   <p>
   * <p>
 * @warning <span class='warning'>The specific integer values of the possible
 * type codes may be reused by different libSBML plug-ins for SBML Level&nbsp;3.
 * packages,  To fully identify the correct code, <strong>it is necessary to
 * invoke both getPackageName() and getTypeCode()</strong> (or 
 * {@link ListOf#getItemTypeCode()}).</span>
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getTypeCode() {
    return libsbmlJNI.SubListOfSpeciesFeatures_getTypeCode(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for the objects contained in this {@link ListOf}
   * (i.e., {@link Compartment} objects, if the list is non-empty).
   <p>
   * <p>
 * LibSBML attaches an identifying code to every kind of SBML object.  These
 * are integer constants known as <em>SBML type codes</em>.  The names of all
 * the codes begin with the characters <code>SBML_</code>.
 * In the Java language interface for libSBML, the
 * type codes are defined as static integer constants in the interface class
 * {@link libsbmlConstants}.    Note that different Level&nbsp;3
 * package plug-ins may use overlapping type codes; to identify the package
 * to which a given object belongs, call the 
 * <code>{@link SBase#getPackageName()}
 * </code>
 * method on the object.
 <p>
 * The exception to this is lists:  all SBML-style list elements have the type 
 * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF}, regardless of what package they 
 * are from.
   <p>
   * @return the SBML type code for the objects contained in this {@link ListOf}
   * instance: {@link libsbmlConstants#SBML_COMPARTMENT SBML_COMPARTMENT} (default).
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getItemTypeCode() {
    return libsbmlJNI.SubListOfSpeciesFeatures_getItemTypeCode(swigCPtr, this);
  }

  
/** * @internal */ public
 void connectToChild() {
    libsbmlJNI.SubListOfSpeciesFeatures_connectToChild(swigCPtr, this);
  }

  
/**
   * Returns the number of {@link SpeciesFeature} objects contained in this
   * {@link SubListOfSpeciesFeatures}.
   <p>
   * A ListOfSpeciesFeature can contain either speciesFeature elements or a
   * {@link SubListOfSpeciesFeatures} (which is derived from {@link ListOf}), which itself
   * contains {@link SpeciesFeature} elements. The sublist also has a couple of
   * attributes which describe the relationship of the members of the sublist
   * to each other and their parent {@link ListOfSpeciesFeatures}.  Here is a sample
   * of the XML:
   * <pre class='fragment'>
&lt;multi:listOfSpeciesFeatures&gt;
  &lt;multi:speciesFeature multi:speciesFeatureType='sftP' multi:occur='1'&gt;
    &lt;snip/&gt;
  &lt;/multi:speciesFeature&gt;
  &lt;multi:subListOfSpeciesFeatures multi:component='stY1' multi:relation='not'&gt;
    &lt;multi:speciesFeature multi:speciesFeatureType='sftYP1' multi:occur='1'&gt;
      &lt;snip/&gt;
    &lt;/multi:speciesFeature&gt;
    &lt;multi:speciesFeature multi:speciesFeatureType='sftYP2' multi:occur='1'&gt;
      &lt;multi:listOfSpeciesFeatureValues&gt;
        &lt;multi:speciesFeatureValue multi:value='yp1v1b'/&gt;
      &lt;/multi:listOfSpeciesFeatureValues&gt;
    &lt;/multi:speciesFeature&gt;
  &lt;/multi:subListOfSpeciesFeatures&gt;
&lt;/multi:listOfSpeciesFeatures&gt;
</pre>
   <p>
   * @return a count of the {@link SpeciesFeature} objects.
   */ public
 long getNumSpeciesFeatures() {
    return libsbmlJNI.SubListOfSpeciesFeatures_getNumSpeciesFeatures(swigCPtr, this);
  }

}