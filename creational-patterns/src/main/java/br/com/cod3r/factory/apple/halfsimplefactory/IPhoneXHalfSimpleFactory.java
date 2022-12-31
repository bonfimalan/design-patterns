package br.com.cod3r.factory.apple.halfsimplefactory;

import static  br.com.cod3r.factory.apple.model.IPhoneLevel.HIGH_END;
import static  br.com.cod3r.factory.apple.model.IPhoneLevel.SIMPLE;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneLevel;

public class IPhoneXHalfSimpleFactory extends IPhoneFactory{

  @Override
  public IPhone createIPhone(IPhoneLevel level) {
    if(level == SIMPLE) {
      return new IPhoneX();
    }
    if(level == HIGH_END) {
      return new IPhoneXSMax();
    }

    return null;
  }
  
}
