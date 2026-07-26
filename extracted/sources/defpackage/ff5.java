package defpackage;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;

/* JADX INFO: loaded from: classes3.dex */
public final class ff5 extends rg1 {
    public static ff5 b() {
        return new ff5(1.0f, 20000, 0);
    }

    @Override // defpackage.rg1
    public final void a(VolleyError volleyError) throws VolleyError {
        if (volleyError instanceof AuthFailureError) {
            throw volleyError;
        }
        super.a(volleyError);
    }
}
