package info.izumin.android.egriot.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by izumin on 3/15/2016 AD.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface WriteCharacteristic {
    String serviceUuid();
    String characteristicUuid();
}
