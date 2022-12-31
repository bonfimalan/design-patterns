package br.com.cod3r.factory.apple.halfsimplefactory;

import static  br.com.cod3r.factory.apple.model.IPhoneLevel.HIGH_END;
import static  br.com.cod3r.factory.apple.model.IPhoneLevel.SIMPLE;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneLevel;

public class IPhone11HalfSimpleFactory extends IPhoneFactory{

  @Override
  public IPhone createIPhone(IPhoneLevel level) {
    if(level == SIMPLE) {
      return new IPhone11();
    }
    if(level == HIGH_END) {
      return new IPhone11Pro();
    }

    return null;
  }
  
}
