package org.koin.androidx.scope;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.c24;
import defpackage.lf7;
import defpackage.rh;
import defpackage.x2;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RetainedScopeActivity extends AppCompatActivity implements rh {
    public final c24 C;

    public RetainedScopeActivity() {
        this(0);
    }

    @Override // defpackage.rh
    public final lf7 b() {
        return (lf7) this.C.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (b() == null) {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public RetainedScopeActivity(int i) {
        super(0);
        this.C = a.a(new x2(14, this));
    }
}
