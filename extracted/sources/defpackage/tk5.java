package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.o;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tk5 extends g {
    public final ArrayList d = new ArrayList();
    public vt4 e;
    public boolean f;
    public final /* synthetic */ bl5 g;

    public tk5(bl5 bl5Var) {
        this.g = bl5Var;
        x();
    }

    @Override // androidx.recyclerview.widget.g
    public final int c() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.g
    public final long d(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.g
    public final int e(int i) {
        vk5 vk5Var = (vk5) this.d.get(i);
        if (vk5Var instanceof wk5) {
            return 2;
        }
        if (vk5Var instanceof uk5) {
            return 3;
        }
        if (vk5Var instanceof xk5) {
            return ((xk5) vk5Var).a.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // androidx.recyclerview.widget.g
    public final void l(o oVar, int i) {
        View view = ((al5) oVar).a;
        int iE = e(i);
        ArrayList arrayList = this.d;
        bl5 bl5Var = this.g;
        if (iE != 0) {
            if (iE != 1) {
                if (iE != 2) {
                    return;
                }
                wk5 wk5Var = (wk5) arrayList.get(i);
                view.setPaddingRelative(bl5Var.s, wk5Var.a, bl5Var.t, wk5Var.b);
                return;
            }
            TextView textView = (TextView) view;
            textView.setText(((xk5) arrayList.get(i)).a.e);
            textView.setTextAppearance(bl5Var.g);
            textView.setPaddingRelative(bl5Var.u, textView.getPaddingTop(), bl5Var.v, textView.getPaddingBottom());
            ColorStateList colorStateList = bl5Var.h;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            q69.q(textView, new sk5(this, i, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        navigationMenuItemView.setIconTintList(bl5Var.l);
        navigationMenuItemView.setTextAppearance(bl5Var.i);
        ColorStateList colorStateList2 = bl5Var.k;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable = bl5Var.m;
        navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
        RippleDrawable rippleDrawable = bl5Var.n;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        xk5 xk5Var = (xk5) arrayList.get(i);
        navigationMenuItemView.setNeedsEmptyIcon(xk5Var.b);
        int i2 = bl5Var.o;
        int i3 = bl5Var.p;
        navigationMenuItemView.setPadding(i2, i3, i2, i3);
        navigationMenuItemView.setIconPadding(bl5Var.q);
        if (bl5Var.w) {
            navigationMenuItemView.setIconSize(bl5Var.r);
        }
        navigationMenuItemView.setMaxLines(bl5Var.y);
        vt4 vt4Var = xk5Var.a;
        navigationMenuItemView.y = bl5Var.j;
        navigationMenuItemView.c(vt4Var);
        q69.q(navigationMenuItemView, new sk5(this, i, false));
    }

    @Override // androidx.recyclerview.widget.g
    public final o n(ViewGroup viewGroup, int i) {
        bl5 bl5Var = this.g;
        if (i == 0) {
            LayoutInflater layoutInflater = bl5Var.f;
            r5 r5Var = bl5Var.C;
            View viewInflate = layoutInflater.inflate(is6.design_navigation_item, viewGroup, false);
            zk5 zk5Var = new zk5(viewInflate);
            viewInflate.setOnClickListener(r5Var);
            return zk5Var;
        }
        if (i == 1) {
            return new rk5(bl5Var.f.inflate(is6.design_navigation_item_subheader, viewGroup, false));
        }
        if (i == 2) {
            return new rk5(bl5Var.f.inflate(is6.design_navigation_item_separator, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new rk5(bl5Var.b);
    }

    @Override // androidx.recyclerview.widget.g
    public final void s(o oVar) {
        al5 al5Var = (al5) oVar;
        if (al5Var instanceof zk5) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) al5Var.a;
            FrameLayout frameLayout = navigationMenuItemView.A;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.z.setCompoundDrawables(null, null, null, null);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void x() {
        if (this.f) {
            return;
        }
        this.f = true;
        ArrayList arrayList = this.d;
        arrayList.clear();
        arrayList.add(new uk5());
        bl5 bl5Var = this.g;
        int size = bl5Var.c.l().size();
        boolean z = false;
        int i = -1;
        int i2 = 0;
        boolean z2 = false;
        int size2 = 0;
        while (i2 < size) {
            vt4 vt4Var = (vt4) bl5Var.c.l().get(i2);
            if (vt4Var.isChecked()) {
                y(vt4Var);
            }
            if (vt4Var.isCheckable()) {
                vt4Var.f(z);
            }
            if (vt4Var.hasSubMenu()) {
                p98 p98Var = vt4Var.o;
                if (p98Var.hasVisibleItems()) {
                    if (i2 != 0) {
                        arrayList.add(new wk5(bl5Var.A, z ? 1 : 0));
                    }
                    arrayList.add(new xk5(vt4Var));
                    int size3 = p98Var.f.size();
                    int i3 = z ? 1 : 0;
                    int i4 = i3;
                    while (i3 < size3) {
                        vt4 vt4Var2 = (vt4) p98Var.getItem(i3);
                        if (vt4Var2.isVisible()) {
                            if (i4 == 0 && vt4Var2.getIcon() != null) {
                                i4 = 1;
                            }
                            if (vt4Var2.isCheckable()) {
                                vt4Var2.f(z);
                            }
                            if (vt4Var2.isChecked()) {
                                y(vt4Var2);
                            }
                            arrayList.add(new xk5(vt4Var2));
                        }
                        i3++;
                        z = false;
                    }
                    if (i4 != 0) {
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            ((xk5) arrayList.get(size5)).b = true;
                        }
                    }
                }
            } else {
                int i5 = vt4Var.b;
                if (i5 != i) {
                    size2 = arrayList.size();
                    z2 = vt4Var.getIcon() != null;
                    if (i2 != 0) {
                        size2++;
                        int i6 = bl5Var.A;
                        arrayList.add(new wk5(i6, i6));
                    }
                } else if (!z2 && vt4Var.getIcon() != null) {
                    int size6 = arrayList.size();
                    for (int i7 = size2; i7 < size6; i7++) {
                        ((xk5) arrayList.get(i7)).b = true;
                    }
                    z2 = true;
                }
                xk5 xk5Var = new xk5(vt4Var);
                xk5Var.b = z2;
                arrayList.add(xk5Var);
                i = i5;
            }
            i2++;
            z = false;
        }
        this.f = z;
    }

    public final void y(vt4 vt4Var) {
        if (this.e == vt4Var || !vt4Var.isCheckable()) {
            return;
        }
        vt4 vt4Var2 = this.e;
        if (vt4Var2 != null) {
            vt4Var2.setChecked(false);
        }
        this.e = vt4Var;
        vt4Var.setChecked(true);
    }
}
