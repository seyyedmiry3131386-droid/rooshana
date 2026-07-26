package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class ri {
    public final XmlPullParser a;
    public int b = 0;
    public final c35 c;

    public ri(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        c35 c35Var = new c35(4);
        c35Var.b = new float[64];
        this.c = c35Var;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        if (a27.j(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        b(typedArray.getChangingConfigurations());
        return f;
    }

    public final void b(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri)) {
            return false;
        }
        ri riVar = (ri) obj;
        return js3.i(this.a, riVar.a) && this.b == riVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return dw1.q(sb, this.b, ')');
    }
}
