package equipment;

/**
* equipment/EquipmentOrHolder_THolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from equipment.idl
* Wednesday, June 15, 2016 7:24:35 PM COT
*/

public final class EquipmentOrHolder_THolder implements org.omg.CORBA.portable.Streamable
{
  public equipment.EquipmentOrHolder_T value = null;

  public EquipmentOrHolder_THolder ()
  {
  }

  public EquipmentOrHolder_THolder (equipment.EquipmentOrHolder_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = equipment.EquipmentOrHolder_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    equipment.EquipmentOrHolder_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return equipment.EquipmentOrHolder_THelper.type ();
  }

}
