package ir.mservices.market.movie.download.quality;

import defpackage.g51;
import defpackage.tx8;
import defpackage.ze2;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import ir.mservices.market.movie.download.quality.DownloadQualityAction;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ze2 {
    public final /* synthetic */ DownloadQualityDialogFragment a;

    public a(DownloadQualityDialogFragment downloadQualityDialogFragment) {
        this.a = downloadQualityDialogFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        ((DownloadQualityViewModel) this.a.j1.getValue()).r(new DownloadQualityAction.UpdateNotEnoughStorageFlow(((MovieDownloadMetaData) obj).f));
        return tx8.a;
    }
}
