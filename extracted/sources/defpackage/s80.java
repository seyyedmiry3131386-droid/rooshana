package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.progressindicator.BaseProgressIndicator;

/* JADX INFO: loaded from: classes.dex */
public final class s80 {
    public aj a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ s80(int i, View view) {
        this.b = i;
        this.c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.b) {
            case 0:
                BaseProgressIndicator baseProgressIndicator = (BaseProgressIndicator) this.c;
                baseProgressIndicator.setIndeterminate(false);
                baseProgressIndicator.setProgressCompat(baseProgressIndicator.b, baseProgressIndicator.c);
                break;
            case 1:
                BaseProgressIndicator baseProgressIndicator2 = (BaseProgressIndicator) this.c;
                if (!baseProgressIndicator2.i) {
                    baseProgressIndicator2.setVisibility(baseProgressIndicator2.j);
                }
                break;
            default:
                ColorStateList colorStateList = ((MaterialCheckBox) this.c).o;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
        }
    }

    public void b(Drawable drawable) {
        switch (this.b) {
            case 2:
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) this.c;
                ColorStateList colorStateList = materialCheckBox.o;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(materialCheckBox.s, colorStateList.getDefaultColor()));
                }
                break;
        }
    }

    public final void c(Drawable drawable) {
    }
}
