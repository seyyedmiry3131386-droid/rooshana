package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i27 {
    public static String a(aq2 aq2Var) {
        String string = aq2Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
