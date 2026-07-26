package ir.mservices.market.movie.download.quality;

import android.os.Parcelable;
import defpackage.bl4;
import defpackage.bt1;
import defpackage.bt2;
import defpackage.e71;
import defpackage.f88;
import defpackage.g51;
import defpackage.jd7;
import defpackage.js3;
import defpackage.n25;
import defpackage.n4;
import defpackage.p25;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.r4;
import defpackage.ru7;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.vy2;
import defpackage.wu0;
import defpackage.xp;
import defpackage.y97;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.download.core.model.MovieDownloadRepositoryImpl$getMovieDownloadState$$inlined$transform$1;
import ir.mservices.market.movie.download.quality.DownloadQualityAction;
import ir.mservices.market.movie.download.quality.recycler.DownloadQualityData;
import ir.mservices.market.movie.download.quality.recycler.DownloadQualityHalfPriceData;
import ir.mservices.market.movie.download.quality.recycler.DownloadQualityRecentData;
import ir.mservices.market.movie.download.quality.recycler.DownloadQualityTitleData;
import ir.mservices.market.movie.uri.downloadInfo.data.DownloadInfoResponse;
import ir.mservices.market.movie.uri.downloadInfo.data.QualityItem;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadQualityViewModel extends ir.mservices.market.viewModel.a {
    public final n25 v;
    public final bt1 w;
    public final i x;

    /* JADX INFO: renamed from: ir.mservices.market.movie.download.quality.DownloadQualityViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.download.quality.DownloadQualityViewModel$1", f = "DownloadQualityViewModel.kt", l = {86}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return DownloadQualityViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return tx8Var;
            }
            b.b(obj);
            DownloadQualityViewModel downloadQualityViewModel = DownloadQualityViewModel.this;
            pv6 pv6Var = downloadQualityViewModel.u;
            r4 r4Var = new r4(23, downloadQualityViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new n4(r4Var, 29), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.download.quality.DownloadQualityViewModel$onUpdateNotEnoughStorageFlow$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.movie.download.quality.DownloadQualityViewModel$onUpdateNotEnoughStorageFlow$1", f = "DownloadQualityViewModel.kt", l = {77}, m = "invokeSuspend", v = 1)
    public static final class C01891 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ DownloadQualityAction.UpdateNotEnoughStorageFlow c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01891(DownloadQualityAction.UpdateNotEnoughStorageFlow updateNotEnoughStorageFlow, g51 g51Var) {
            super(2, g51Var);
            this.c = updateNotEnoughStorageFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return DownloadQualityViewModel.this.new C01891(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01891) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                i iVar = DownloadQualityViewModel.this.x;
                Integer num = new Integer(this.c.getQuality());
                this.a = 1;
                if (iVar.emit(num, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadQualityViewModel(jd7 jd7Var, n25 n25Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(n25Var, "movieDownloadRepository");
        this.v = n25Var;
        if (!jd7Var.a("data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) jd7Var.b("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("playId")) {
            throw new IllegalArgumentException("Required argument \"playId\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("playId");
        if (!jd7Var.a("refId")) {
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("refId");
        if (!jd7Var.a("movieName")) {
            throw new IllegalArgumentException("Required argument \"movieName\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) jd7Var.b("movieName");
        if (str3 == null) {
            throw new IllegalArgumentException("Argument \"movieName\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("secondaryTitle")) {
            throw new IllegalArgumentException("Required argument \"secondaryTitle\" is missing and does not have an android:defaultValue");
        }
        String str4 = (String) jd7Var.b("secondaryTitle");
        if (!jd7Var.a("movieId")) {
            throw new IllegalArgumentException("Required argument \"movieId\" is missing and does not have an android:defaultValue");
        }
        String str5 = (String) jd7Var.b("movieId");
        if (str5 == null) {
            throw new IllegalArgumentException("Argument \"movieId\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("downloadInfo")) {
            throw new IllegalArgumentException("Required argument \"downloadInfo\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DownloadInfoResponse.class) && !Serializable.class.isAssignableFrom(DownloadInfoResponse.class)) {
            throw new UnsupportedOperationException(DownloadInfoResponse.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        this.w = new bt1(dialogDataModel, str, str2, str3, str4, str5, (DownloadInfoResponse) jd7Var.b("downloadInfo"));
        this.x = vy2.e(0, 7, null);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RecyclerItem> fillRecyclerItems(DownloadInfoResponse downloadInfoResponse) {
        String secondaryTitle;
        ArrayList arrayList = new ArrayList();
        bt1 bt1Var = this.w;
        DownloadInfoResponse downloadInfoResponse2 = bt1Var.g;
        String str = null;
        if (downloadInfoResponse2 != null && (secondaryTitle = downloadInfoResponse2.getSecondaryTitle()) != null) {
            if (f88.n0(secondaryTitle)) {
                secondaryTitle = null;
            }
            if (secondaryTitle != null) {
                arrayList.add(new DownloadQualityTitleData(secondaryTitle));
            }
        }
        List<QualityItem> qualities = downloadInfoResponse.getQualities();
        n25 n25Var = this.v;
        if (qualities != null) {
            for (QualityItem qualityItem : qualities) {
                String str2 = bt1Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                String strValueOf = String.valueOf(qualityItem.getQuality());
                n25Var.getClass();
                arrayList.add(new DownloadQualityData(qualityItem, d.A(new vb7(new MovieDownloadRepositoryImpl$getMovieDownloadState$$inlined$transform$1(n25Var.a.l, null, str2, strValueOf)), y97.G(this), ru7.b, new p25(null)), this.x));
            }
        }
        String description = downloadInfoResponse.getDescription();
        if (description != null && !f88.n0(description)) {
            str = description;
        }
        if (str != null) {
            arrayList.add(new DownloadQualityHalfPriceData(str));
        }
        ir.mservices.market.movie.download.core.source.a aVar = n25Var.a;
        arrayList.add(new DownloadQualityRecentData(d.k(new xp(aVar.k, aVar, 11))));
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList2);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdateNotEnoughStorageFlow(DownloadQualityAction.UpdateNotEnoughStorageFlow updateNotEnoughStorageFlow) {
        bt2.G(y97.G(this), null, null, new C01891(updateNotEnoughStorageFlow, null), 3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new DownloadQualityViewModel$doRequest$1(this, null));
    }
}
