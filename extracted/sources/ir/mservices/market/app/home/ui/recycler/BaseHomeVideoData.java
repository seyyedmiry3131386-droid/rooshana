package ir.mservices.market.app.home.ui.recycler;

import defpackage.fm3;
import defpackage.jb7;
import defpackage.js6;
import defpackage.kz8;
import defpackage.pg;
import defpackage.pv1;
import defpackage.tn0;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.VideoRowDto;

/* JADX INFO: loaded from: classes3.dex */
public class BaseHomeVideoData implements MyketRecyclerData, kz8, fm3, jb7 {
    public static final int c = js6.home_video_row;
    public static final int d = js6.home_video_digested_row;
    public final VideoRowDto a;
    public final boolean b;

    public BaseHomeVideoData(VideoRowDto videoRowDto, boolean z) {
        this.a = videoRowDto;
        this.b = z;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return !this.b ? c : d;
    }

    @Override // defpackage.fm3
    public final pv1 a() {
        ApplicationDTO application;
        VideoRowDto videoRowDto = this.a;
        if (videoRowDto == null || (application = videoRowDto.getApplication()) == null) {
            return null;
        }
        return new pv1(2, application.isIncompatible());
    }

    @Override // defpackage.jb7
    public final pg b() {
        ApplicationDTO application;
        VideoRowDto videoRowDto = this.a;
        if (videoRowDto == null || (application = videoRowDto.getApplication()) == null) {
            return null;
        }
        return new pg(videoRowDto.getApplication().getPackageName(), application.getVersionCode(), videoRowDto.getApplication().getForceUpdate());
    }

    @Override // defpackage.kz8
    public final tn0 c() {
        ApplicationDTO application;
        VideoRowDto videoRowDto = this.a;
        if (videoRowDto == null || (application = videoRowDto.getApplication()) == null) {
            return null;
        }
        return new tn0(videoRowDto.getApplication().getPackageName(), application.getVersionCode(), videoRowDto.getApplication().getForceUpdate());
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }
}
