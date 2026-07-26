package defpackage;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w22 extends qt8 {
    public static final v22 d = new v22();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public w22(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String strName = r4.name();
                String string = r4.toString();
                vo7 vo7Var = (vo7) field2.getAnnotation(vo7.class);
                if (vo7Var != null) {
                    strName = vo7Var.value();
                    for (String str : vo7Var.alternate()) {
                        this.a.put(str, r4);
                    }
                }
                this.a.put(strName, r4);
                this.b.put(string, r4);
                this.c.put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        if (mw3Var.R() == JsonToken.i) {
            mw3Var.J();
            return null;
        }
        String strT = mw3Var.t();
        Enum r0 = (Enum) this.a.get(strT);
        return r0 == null ? (Enum) this.b.get(strT) : r0;
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        Enum r3 = (Enum) obj;
        uw3Var.U(r3 == null ? null : (String) this.c.get(r3));
    }
}
