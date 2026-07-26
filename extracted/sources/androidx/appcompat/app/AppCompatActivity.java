package androidx.appcompat.app;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import defpackage.ac8;
import defpackage.bn6;
import defpackage.hf8;
import defpackage.ln;
import defpackage.pn;
import defpackage.r39;
import defpackage.rm;
import defpackage.sm;
import defpackage.tm;
import defpackage.ym;
import defpackage.yq2;
import defpackage.zk8;
import defpackage.zm;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements tm {
    public ln B;

    public AppCompatActivity() {
        ((bn6) this.d.c).u("androidx:appcompat", new rm(this));
        I(new sm(this, 0));
    }

    public final zm O() {
        if (this.B == null) {
            ym ymVar = zm.a;
            this.B = new ln(this, null, this, this);
        }
        return this.B;
    }

    public final zk8 P() {
        ln lnVar = (ln) O();
        lnVar.B();
        return lnVar.o;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ln lnVar = (ln) O();
        lnVar.w();
        ((ViewGroup) lnVar.B.findViewById(R.id.content)).addView(view, layoutParams);
        lnVar.m.a(lnVar.l.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatActivity.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        zk8 zk8VarP = P();
        if (getWindow().hasFeature(0)) {
            if (zk8VarP == null || !zk8VarP.u()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        zk8 zk8VarP = P();
        if (keyCode == 82 && zk8VarP != null && zk8VarP.U(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        ln lnVar = (ln) O();
        lnVar.w();
        return lnVar.l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        ln lnVar = (ln) O();
        if (lnVar.p == null) {
            lnVar.B();
            zk8 zk8Var = lnVar.o;
            lnVar.p = new ac8(zk8Var != null ? zk8Var.G() : lnVar.k);
        }
        return lnVar.p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = r39.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        O().a();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException {
        super.onConfigurationChanged(configuration);
        ln lnVar = (ln) O();
        if (lnVar.G && lnVar.A) {
            lnVar.B();
            zk8 zk8Var = lnVar.o;
            if (zk8Var != null) {
                zk8Var.R();
            }
        }
        pn pnVarA = pn.a();
        Context context = lnVar.k;
        synchronized (pnVarA) {
            pnVarA.a.l(context);
        }
        lnVar.S = new Configuration(lnVar.k.getResources().getConfiguration());
        lnVar.m(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        O().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentG0;
        if (!super.onMenuItemSelected(i, menuItem)) {
            zk8 zk8VarP = P();
            if (menuItem.getItemId() != 16908332 || zk8VarP == null || (zk8VarP.F() & 4) == 0 || (intentG0 = yq2.g0(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentG0)) {
                navigateUpTo(intentG0);
                return true;
            }
            hf8 hf8Var = new hf8(this);
            Intent intentG02 = yq2.g0(this);
            if (intentG02 == null) {
                intentG02 = yq2.g0(this);
            }
            if (intentG02 != null) {
                ComponentName component = intentG02.getComponent();
                if (component == null) {
                    component = intentG02.resolveActivity(hf8Var.b.getPackageManager());
                }
                hf8Var.a(component);
                hf8Var.a.add(intentG02);
            }
            hf8Var.c();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((ln) O()).w();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        ln lnVar = (ln) O();
        lnVar.B();
        zk8 zk8Var = lnVar.o;
        if (zk8Var != null) {
            zk8Var.k0(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        ((ln) O()).m(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        ln lnVar = (ln) O();
        lnVar.B();
        zk8 zk8Var = lnVar.o;
        if (zk8Var != null) {
            zk8Var.k0(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        O().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        zk8 zk8VarP = P();
        if (getWindow().hasFeature(0)) {
            if (zk8VarP == null || !zk8VarP.V()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        J();
        O().h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((ln) O()).U = i;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        J();
        O().i(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        O().j(view, layoutParams);
    }

    public AppCompatActivity(int i) {
        super(0);
        ((bn6) this.d.c).u("androidx:appcompat", new rm(this));
        I(new sm(this, 0));
    }
}
