package CosNotifyFilter;


/**
* CosNotifyFilter/_MappingFilterStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosNotifyFilter.idl
* Wednesday, June 15, 2016 7:24:33 PM COT
*/


/**
    * Interface for a mapping filter.
    */
public class _MappingFilterStub extends org.omg.CORBA.portable.ObjectImpl implements CosNotifyFilter.MappingFilter
{


  /**
         * The constraint grammer used by this filter.
         */
  public String constraint_grammar ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_constraint_grammar", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return constraint_grammar (        );
            } finally {
                _releaseReply ($in);
            }
  } // constraint_grammar


  /**
         * The data type of the property value that this filter was designed
         * to affect.
         */
  public org.omg.CORBA.TypeCode value_type ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_value_type", true);
                $in = _invoke ($out);
                org.omg.CORBA.TypeCode $result = $in.read_TypeCode ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return value_type (        );
            } finally {
                _releaseReply ($in);
            }
  } // value_type


  /**
         * The output value for any match operation that returns true.
         */
  public org.omg.CORBA.Any default_value ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_default_value", true);
                $in = _invoke ($out);
                org.omg.CORBA.Any $result = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return default_value (        );
            } finally {
                _releaseReply ($in);
            }
  } // default_value


  /**
         * Associates one or more mapping constraints with this filter object.
         * @parm <code>constraint_list</code> - List of mapping constraints to
         * be associated with filter.
         * @returns A list with ID for each of the added mapping constraints.
         * @raises InvalidConstraint If any of the mapping constraints
         * are invalid.
         * @raises InvalidValue If any of the constraints have a typecode
         * that is different from the <code>value_type</code> attribute.
         */
  public CosNotifyFilter.MappingConstraintInfo[] add_mapping_constraints (CosNotifyFilter.MappingConstraintPair[] pair_list) throws CosNotifyFilter.InvalidConstraint, CosNotifyFilter.InvalidValue
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("add_mapping_constraints", true);
                CosNotifyFilter.MappingConstraintPairSeqHelper.write ($out, pair_list);
                $in = _invoke ($out);
                CosNotifyFilter.MappingConstraintInfo $result[] = CosNotifyFilter.MappingConstraintInfoSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidConstraint:1.0"))
                    throw CosNotifyFilter.InvalidConstraintHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidValue:1.0"))
                    throw CosNotifyFilter.InvalidValueHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return add_mapping_constraints (pair_list        );
            } finally {
                _releaseReply ($in);
            }
  } // add_mapping_constraints


  /**
         * Delete or modify mapping constraints on this filter object.
         * @parm <code>del_list</code> - List of mapping constraints to delete.
         * @parm <code>modify_list</code> - List of constraints to modify.
         * @raises InvalidConstraint If any of the constraints in the
         * modify_list input sequences are invalid.
         * @raises InvalidValue If any of the constraints have a typecode
         * that is different from the <code>value_type</code> attribute.
         * @raises ConstraintNotFound If a constraint in either
         * of the two input sequences was not found.
         */
  public void modify_mapping_constraints (int[] del_list, CosNotifyFilter.MappingConstraintInfo[] modify_list) throws CosNotifyFilter.InvalidConstraint, CosNotifyFilter.InvalidValue, CosNotifyFilter.ConstraintNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("modify_mapping_constraints", true);
                CosNotifyFilter.ConstraintIDSeqHelper.write ($out, del_list);
                CosNotifyFilter.MappingConstraintInfoSeqHelper.write ($out, modify_list);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidConstraint:1.0"))
                    throw CosNotifyFilter.InvalidConstraintHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidValue:1.0"))
                    throw CosNotifyFilter.InvalidValueHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNotifyFilter/ConstraintNotFound:1.0"))
                    throw CosNotifyFilter.ConstraintNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                modify_mapping_constraints (del_list, modify_list        );
            } finally {
                _releaseReply ($in);
            }
  } // modify_mapping_constraints


  /**
         * Return a list of mapping constraints for this filter object
         * based on IDs.
         * @parm <code>id_list</code> - List of mapping constraint IDs.
         * @returns A list of mapping constraints for the IDs in the
         * input sequence.
         * @raises ConstraintNotFound If a mapping constraint was not found.
         */
  public CosNotifyFilter.MappingConstraintInfo[] get_mapping_constraints (int[] id_list) throws CosNotifyFilter.ConstraintNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_mapping_constraints", true);
                CosNotifyFilter.ConstraintIDSeqHelper.write ($out, id_list);
                $in = _invoke ($out);
                CosNotifyFilter.MappingConstraintInfo $result[] = CosNotifyFilter.MappingConstraintInfoSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/ConstraintNotFound:1.0"))
                    throw CosNotifyFilter.ConstraintNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_mapping_constraints (id_list        );
            } finally {
                _releaseReply ($in);
            }
  } // get_mapping_constraints


  /**
         * Return a list of all mapping constraints for this filter object.
         * @returns A list of all mapping constraints.
         */
  public CosNotifyFilter.MappingConstraintInfo[] get_all_mapping_constraints ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_all_mapping_constraints", true);
                $in = _invoke ($out);
                CosNotifyFilter.MappingConstraintInfo $result[] = CosNotifyFilter.MappingConstraintInfoSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_all_mapping_constraints (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_all_mapping_constraints


  /**
         * Removes all mapping constraints defined on this filter object.
         */
  public void remove_all_mapping_constraints ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("remove_all_mapping_constraints", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                remove_all_mapping_constraints (        );
            } finally {
                _releaseReply ($in);
            }
  } // remove_all_mapping_constraints


  /**
         * Destroys this mapping filter object.
         */
  public void destroy ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("destroy", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                destroy (        );
            } finally {
                _releaseReply ($in);
            }
  } // destroy


  /**
         * Evaluates the input event against the filter constraints defined
         * on this filter object. If the event satisfies one of the filter
         * constraints TRUE is returned, otherwise FALSE is returned.
         * @parm <code>filterable_data</code> - The event to evaluate.
         * @parm <code>result_to_set</code> - Value of a constraint that
         * matches the event or <code>default_value</code> if the event
         * does not match any constraints.
         * @returns TRUE if event matches any constraint, FALSE otherwise.
         * raises UnsupportedFilterableData If the event specified by
         * <code>filterable_data</code> contains data that this filter is
         * not designed to handle.
         */
  public boolean match (org.omg.CORBA.Any filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws CosNotifyFilter.UnsupportedFilterableData
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("match", true);
                $out.write_any (filterable_data);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                result_to_set.value = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
                    throw CosNotifyFilter.UnsupportedFilterableDataHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return match (filterable_data, result_to_set        );
            } finally {
                _releaseReply ($in);
            }
  } // match


  /**
         * Evaluates the input event against the filter constraints defined
         * on this filter object. If the event satisfies one of the filter
         * constraints TRUE is returned, otherwise FALSE is returned.
         * @parm <code>filterable_data</code> - The structured event to evaluate.
         * @parm <code>result_to_set</code> - Value of a constraint that
         * matches the event or <code>default_value</code> if the event
         * does not match any constraints.
         * @returns TRUE if event matches any constraint, FALSE otherwise.
         * raises UnsupportedFilterableData If the event specified by
         * <code>filterable_data</code> contains data that this filter is
         * not designed to handle.
         */
  public boolean match_structured (CosNotification.StructuredEvent filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws CosNotifyFilter.UnsupportedFilterableData
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("match_structured", true);
                CosNotification.StructuredEventHelper.write ($out, filterable_data);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                result_to_set.value = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
                    throw CosNotifyFilter.UnsupportedFilterableDataHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return match_structured (filterable_data, result_to_set        );
            } finally {
                _releaseReply ($in);
            }
  } // match_structured


  /**
         * Evaluates the input event against the filter constraints defined
         * on this filter object. If the event satisfies one of the filter
         * constraints TRUE is returned, otherwise FALSE is returned.
         * @parm <code>filterable_data</code> - The typed event to evaluate.
         * @parm <code>result_to_set</code> - Value of a constraint that
         * matches the event or default_value if the event does not match
         * any constraints.
         * @returns TRUE if event matches any constraint, FALSE otherwise.
         * raises UnsupportedFilterableData If the event specified by
         * <code>filterable_data</code> contains data that this filter is
         * not designed to handle.
         */
  public boolean match_typed (CosNotification.Property[] filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws CosNotifyFilter.UnsupportedFilterableData
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("match_typed", true);
                CosNotification.PropertySeqHelper.write ($out, filterable_data);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                result_to_set.value = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
                    throw CosNotifyFilter.UnsupportedFilterableDataHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return match_typed (filterable_data, result_to_set        );
            } finally {
                _releaseReply ($in);
            }
  } // match_typed

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyFilter/MappingFilter:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _MappingFilterStub