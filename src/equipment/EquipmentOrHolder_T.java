package equipment;


/**
* equipment/EquipmentOrHolder_T.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from equipment.idl
* Wednesday, June 15, 2016 7:24:35 PM COT
*/

public final class EquipmentOrHolder_T implements org.omg.CORBA.portable.IDLEntity
{
  private equipment.Equipment_T ___equip;
  private equipment.EquipmentHolder_T ___holder;
  private equipment.EquipmentTypeQualifier_T __discriminator;
  private boolean __uninitialized = true;

  public EquipmentOrHolder_T ()
  {
  }

  public equipment.EquipmentTypeQualifier_T discriminator ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    return __discriminator;
  }

  public equipment.Equipment_T equip ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyequip (__discriminator);
    return ___equip;
  }

  public void equip (equipment.Equipment_T value)
  {
    __discriminator = equipment.EquipmentTypeQualifier_T.EQT;
    ___equip = value;
    __uninitialized = false;
  }

  public void equip (equipment.EquipmentTypeQualifier_T discriminator, equipment.Equipment_T value)
  {
    verifyequip (discriminator);
    __discriminator = discriminator;
    ___equip = value;
    __uninitialized = false;
  }

  private void verifyequip (equipment.EquipmentTypeQualifier_T discriminator)
  {
    if (discriminator != equipment.EquipmentTypeQualifier_T.EQT)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public equipment.EquipmentHolder_T holder ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyholder (__discriminator);
    return ___holder;
  }

  public void holder (equipment.EquipmentHolder_T value)
  {
    __discriminator = equipment.EquipmentTypeQualifier_T.EQT_HOLDER;
    ___holder = value;
    __uninitialized = false;
  }

  public void holder (equipment.EquipmentTypeQualifier_T discriminator, equipment.EquipmentHolder_T value)
  {
    verifyholder (discriminator);
    __discriminator = discriminator;
    ___holder = value;
    __uninitialized = false;
  }

  private void verifyholder (equipment.EquipmentTypeQualifier_T discriminator)
  {
    if (discriminator != equipment.EquipmentTypeQualifier_T.EQT_HOLDER)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

} // class EquipmentOrHolder_T
