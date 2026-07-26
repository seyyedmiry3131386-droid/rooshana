package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.compose.runtime.i;
import io.sentry.ScopeBindingMode;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public class um {
    public Object a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public Object f;

    public /* synthetic */ um(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.c) {
                    drawableMutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) this.f;
        Drawable checkMarkDrawable = appCompatCheckedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.c) {
                    drawableMutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(appCompatCheckedTextView.getDrawableState());
                }
                appCompatCheckedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Object c() {
        if (this.c) {
            return null;
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        sz0.b("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }

    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        sk6 sk6VarD = sk6.D(compoundButton.getContext(), attributeSet, lu6.CompoundButton, i);
        TypedArray typedArray = (TypedArray) sk6VarD.c;
        q69.p(compoundButton, compoundButton.getContext(), lu6.CompoundButton, attributeSet, (TypedArray) sk6VarD.c, i);
        try {
            if (typedArray.hasValue(lu6.CompoundButton_buttonCompat) && (resourceId2 = typedArray.getResourceId(lu6.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(rf0.v(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(lu6.CompoundButton_android_button)) {
                        compoundButton.setButtonDrawable(rf0.v(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(lu6.CompoundButton_android_button) && (resourceId = typedArray.getResourceId(lu6.CompoundButton_android_button, 0)) != 0) {
                compoundButton.setButtonDrawable(rf0.v(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(lu6.CompoundButton_buttonTint)) {
                compoundButton.setButtonTintList(sk6VarD.t(lu6.CompoundButton_buttonTint));
            }
            if (typedArray.hasValue(lu6.CompoundButton_buttonTintMode)) {
                compoundButton.setButtonTintMode(aw1.c(typedArray.getInt(lu6.CompoundButton_buttonTintMode, -1), null));
            }
            sk6VarD.G();
        } catch (Throwable th) {
            sk6VarD.G();
            throw th;
        }
    }

    public um() {
        this.f = null;
        this.a = ScopeBindingMode.AUTO;
        this.c = false;
        this.d = false;
        this.e = false;
        this.b = "manual";
    }

    public um(i iVar, Object obj, boolean z, t08 t08Var, boolean z2) {
        this.f = iVar;
        this.c = z;
        this.a = t08Var;
        this.d = z2;
        this.b = obj;
        this.e = true;
    }
}
