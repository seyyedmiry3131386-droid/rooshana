package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uw2 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bp2 b;

    public /* synthetic */ uw2(int i, bp2 bp2Var) {
        this.a = i;
        this.b = bp2Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                try {
                    return (List) this.b.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return EmptyList.a;
                }
            case 1:
                this.b.invoke();
                break;
            case 2:
                this.b.invoke();
                break;
            default:
                float fFloatValue = ((Number) this.b.invoke()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                return Float.valueOf(fFloatValue);
        }
        return Boolean.TRUE;
    }
}
