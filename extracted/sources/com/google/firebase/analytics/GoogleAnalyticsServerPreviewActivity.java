package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import defpackage.vn9;
import defpackage.yo9;

/* JADX INFO: loaded from: classes.dex */
public class GoogleAnalyticsServerPreviewActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        yo9 yo9VarE = yo9.e(this, null);
        Intent intent = getIntent();
        yo9VarE.getClass();
        yo9VarE.c(new vn9(yo9VarE, intent, 4));
        finish();
    }
}
