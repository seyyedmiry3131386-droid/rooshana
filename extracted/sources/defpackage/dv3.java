package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dv3 implements uq5 {
    public final /* synthetic */ int a;

    public /* synthetic */ dv3(int i) {
        this.a = i;
    }

    @Override // defpackage.p12
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                vq5 vq5Var = (vq5) obj2;
                vq5Var.a(kn6.g, entry.getKey());
                vq5Var.a(kn6.h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
