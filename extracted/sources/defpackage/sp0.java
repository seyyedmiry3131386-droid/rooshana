package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class sp0 implements zi6 {
    public abstract boolean a(char c);

    @Override // defpackage.zi6
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
