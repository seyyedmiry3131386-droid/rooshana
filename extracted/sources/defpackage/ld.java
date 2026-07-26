package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ld extends nn implements DialogInterface {
    public final jd g;

    public ld(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, g(contextThemeWrapper, i));
        this.g = new jd(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(xp6.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.nn, defpackage.jy0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        jd jdVar = this.g;
        jdVar.b.setContentView(jdVar.y);
        Context context = jdVar.a;
        Window window = jdVar.c;
        View viewFindViewById2 = window.findViewById(pr6.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(pr6.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(pr6.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(pr6.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(pr6.customPanel);
        View view = jdVar.f;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !jd.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(pr6.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (jdVar.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (jdVar.e != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(pr6.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(pr6.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(pr6.buttonPanel);
        ViewGroup viewGroupB = jd.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = jd.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = jd.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(pr6.scrollView);
        jdVar.q = nestedScrollView;
        nestedScrollView.setFocusable(false);
        jdVar.q.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(R.id.message);
        jdVar.u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            jdVar.q.removeView(jdVar.u);
            if (jdVar.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) jdVar.q.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(jdVar.q);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(jdVar.e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupB3.findViewById(R.id.button1);
        jdVar.h = button;
        r5 r5Var = jdVar.E;
        button.setOnClickListener(r5Var);
        if (TextUtils.isEmpty(jdVar.i)) {
            jdVar.h.setVisibility(8);
            i = 0;
        } else {
            jdVar.h.setText(jdVar.i);
            jdVar.h.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(R.id.button2);
        jdVar.k = button2;
        button2.setOnClickListener(r5Var);
        if (TextUtils.isEmpty(jdVar.l)) {
            jdVar.k.setVisibility(8);
        } else {
            jdVar.k.setText(jdVar.l);
            jdVar.k.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(R.id.button3);
        jdVar.n = button3;
        button3.setOnClickListener(r5Var);
        if (TextUtils.isEmpty(jdVar.o)) {
            jdVar.n.setVisibility(8);
        } else {
            jdVar.n.setText(jdVar.o);
            jdVar.n.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(xp6.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = jdVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = jdVar.k;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = jdVar.n;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (jdVar.v != null) {
            viewGroupB.addView(jdVar.v, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(pr6.title_template).setVisibility(8);
        } else {
            jdVar.s = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(jdVar.d) || !jdVar.C) {
                window.findViewById(pr6.title_template).setVisibility(8);
                jdVar.s.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(pr6.alertTitle);
                jdVar.t = textView2;
                textView2.setText(jdVar.d);
                Drawable drawable = jdVar.r;
                if (drawable != null) {
                    jdVar.s.setImageDrawable(drawable);
                } else {
                    jdVar.t.setPadding(jdVar.s.getPaddingLeft(), jdVar.s.getPaddingTop(), jdVar.s.getPaddingRight(), jdVar.s.getPaddingBottom());
                    jdVar.s.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z4 = viewGroupB3.getVisibility() != 8;
        if (!z4 && (viewFindViewById = viewGroupB2.findViewById(pr6.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (z3 != 0) {
            NestedScrollView nestedScrollView2 = jdVar.q;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = jdVar.e != null ? viewGroupB.findViewById(pr6.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(pr6.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = jdVar.e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.setHasDecor(z3, z4);
        }
        if (!z2) {
            View view2 = jdVar.e;
            if (view2 == null) {
                view2 = jdVar.q;
            }
            if (view2 != null) {
                int i2 = z4 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(pr6.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(pr6.scrollIndicatorDown);
                WeakHashMap weakHashMap = q69.a;
                i69.b(view2, z3 | i2, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = jdVar.e;
        if (alertController$RecycleListView2 == null || (listAdapter = jdVar.w) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i3 = jdVar.x;
        if (i3 > -1) {
            alertController$RecycleListView2.setItemChecked(i3, true);
            alertController$RecycleListView2.setSelection(i3);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.q;
        if (nestedScrollView == null || !nestedScrollView.e(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.q;
        if (nestedScrollView == null || !nestedScrollView.e(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.nn, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        jd jdVar = this.g;
        jdVar.d = charSequence;
        TextView textView = jdVar.t;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
