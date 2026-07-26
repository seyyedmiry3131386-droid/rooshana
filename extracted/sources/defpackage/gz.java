package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gz {
    public boolean a;
    public boolean b;
    public boolean c;

    public hz a() {
        if (this.a || !(this.b || this.c)) {
            return new hz(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public boolean b() {
        return (this.c || this.b) && this.a;
    }
}
