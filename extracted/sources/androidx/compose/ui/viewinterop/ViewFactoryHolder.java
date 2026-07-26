package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AbstractComposeView;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.ed7;
import defpackage.fd7;
import defpackage.sk6;
import defpackage.tx8;

/* JADX INFO: loaded from: classes.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder {
    public final View B;
    public final androidx.compose.ui.input.nestedscroll.a C;
    public ed7 D;
    public dp2 E;
    public dp2 F;
    public dp2 G;

    public ViewFactoryHolder(Context context, dp2 dp2Var, androidx.compose.runtime.a aVar, fd7 fd7Var, int i, Owner owner) {
        View view = (View) dp2Var.invoke(context);
        androidx.compose.ui.input.nestedscroll.a aVar2 = new androidx.compose.ui.input.nestedscroll.a();
        super(context, aVar, i, aVar2, view, owner);
        this.B = view;
        this.C = aVar2;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objE = fd7Var != null ? fd7Var.e(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (fd7Var != null) {
            setSavableRegistryEntry(fd7Var.a(strValueOf, new bp2() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1
                {
                    super(0);
                }

                @Override // defpackage.bp2
                public final Object invoke() {
                    SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
                    this.g.B.saveHierarchyState(sparseArray2);
                    return sparseArray2;
                }
            }));
        }
        dp2 dp2Var2 = b.a;
        this.E = dp2Var2;
        this.F = dp2Var2;
        this.G = dp2Var2;
    }

    public static final void m(ViewFactoryHolder viewFactoryHolder) {
        viewFactoryHolder.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(ed7 ed7Var) {
        ed7 ed7Var2 = this.D;
        if (ed7Var2 != null) {
            ((sk6) ed7Var2).K();
        }
        this.D = ed7Var;
    }

    public final androidx.compose.ui.input.nestedscroll.a getDispatcher() {
        return this.C;
    }

    public final dp2 getReleaseBlock() {
        return this.G;
    }

    public final dp2 getResetBlock() {
        return this.F;
    }

    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return null;
    }

    public final dp2 getUpdateBlock() {
        return this.E;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(dp2 dp2Var) {
        this.G = dp2Var;
        setRelease(new bp2() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                ViewFactoryHolder viewFactoryHolder = this.g;
                viewFactoryHolder.getReleaseBlock().invoke(viewFactoryHolder.B);
                ViewFactoryHolder.m(viewFactoryHolder);
                return tx8.a;
            }
        });
    }

    public final void setResetBlock(dp2 dp2Var) {
        this.F = dp2Var;
        setReset(new bp2() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                ViewFactoryHolder viewFactoryHolder = this.g;
                viewFactoryHolder.getResetBlock().invoke(viewFactoryHolder.B);
                return tx8.a;
            }
        });
    }

    public final void setUpdateBlock(dp2 dp2Var) {
        this.E = dp2Var;
        setUpdate(new bp2() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                ViewFactoryHolder viewFactoryHolder = this.g;
                viewFactoryHolder.getUpdateBlock().invoke(viewFactoryHolder.B);
                return tx8.a;
            }
        });
    }
}
