/**
 Copyright (C) 2013-2014  Barcelona Supercomputing Center

 This library is free software; you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public
 License as published by the Free Software Foundation; either
 version 2.1 of the License, or (at your option) any later version.

 This library is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public
 License along with this library; if not, write to the Free Software
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package es.bsc.vmmclient.models;

import com.google.common.base.MoreObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImagesUploadedResponse {

    private final List<ImageUploaded> images = new ArrayList<>();

    public ImagesUploadedResponse(List<ImageUploaded> images) {
        this.images.addAll(images);
    }

    public List<ImageUploaded> getImages() {
        return Collections.unmodifiableList(images);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("images", images)
                .toString();
    }

}
