package org.checkerframework.checker.formatter.qual;

import j$.util.StringJoiner;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public enum ConversionCategory {
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL(null),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR(Character.class, Byte.class, Short.class, Integer.class),
    /* JADX INFO: Fake field, exist only in values array */
    INT(Byte.class, Short.class, Integer.class, Long.class, BigInteger.class),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT(Float.class, Double.class, BigDecimal.class),
    /* JADX INFO: Fake field, exist only in values array */
    TIME(Long.class, Calendar.class, Date.class),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR_AND_INT(Byte.class, Short.class, Integer.class),
    /* JADX INFO: Fake field, exist only in values array */
    INT_AND_TIME(Long.class),
    /* JADX INFO: Fake field, exist only in values array */
    NULL(new Class[0]),
    /* JADX INFO: Fake field, exist only in values array */
    UNUSED(null);

    public final Class[] a;

    ConversionCategory(Class... clsArr) {
        if (clsArr == null) {
            this.a = clsArr;
            return;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        int length = clsArr.length;
        for (int i = 0; i < length; i++) {
            Class cls = clsArr[i];
            arrayList.add(cls);
            Class cls2 = cls == Byte.class ? Byte.TYPE : cls == Character.class ? Character.TYPE : cls == Short.class ? Short.TYPE : cls == Integer.class ? Integer.TYPE : cls == Long.class ? Long.TYPE : cls == Float.class ? Float.TYPE : cls == Double.class ? Double.TYPE : cls == Boolean.class ? Boolean.TYPE : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
        }
        this.a = (Class[]) arrayList.toArray(new Class[0]);
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append(" conversion category");
        Class[] clsArr = this.a;
        if (clsArr == null || clsArr.length == 0) {
            return sb.toString();
        }
        StringJoiner stringJoiner = new StringJoiner(", ", "(one of: ", ")");
        for (Class cls : clsArr) {
            stringJoiner.add(cls.getSimpleName());
        }
        sb.append(" ");
        sb.append(stringJoiner);
        return sb.toString();
    }
}
