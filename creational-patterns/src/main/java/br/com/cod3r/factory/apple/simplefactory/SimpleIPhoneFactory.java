package br.com.cod3r.factory.apple.simplefactory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneGeneration;
import br.com.cod3r.factory.apple.model.IPhoneLevel;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;


public class SimpleIPhoneFactory {
  public static IPhone orderIPhone(IPhoneGeneration generation, IPhoneLevel level) {
    IPhone iPhone = createIPhone(generation, level);

    iPhone.getHardware();
    iPhone.assemble();
    iPhone.certificates();
    iPhone.pack();

    return iPhone;
  }

  public static IPhone createIPhone(IPhoneGeneration generation, IPhoneLevel level) {
    if(generation == IPhoneGeneration.IP_11) {
      if(level == IPhoneLevel.SIMPLE) {
        return new IPhone11();
      }
      if(level == IPhoneLevel.HIGH_END) {
        return new IPhone11Pro();
      }
    }
    if(generation == IPhoneGeneration.IP_X) {
      if(level == IPhoneLevel.SIMPLE) {
        return new IPhoneX();
      }
      if(level == IPhoneLevel.HIGH_END) {
        return new IPhoneXSMax();
      }
    }

    return null;
  }
}
