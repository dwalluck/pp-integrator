/*
 * Copyright (C) 2020 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.pnc.ppitegrator.pp.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Product extends BaseInfo {
    @NotNull
    @Positive
    private Long bu;

    @JsonProperty("bu_shortname")
    @NotEmpty
    private String buShortname;

    @JsonProperty("bu_name")
    @NotEmpty
    private String buName;

    @JsonProperty("product_group_name")
    private String productGroupName;

    @NotNull
    @Size(max = 128)
    private String bugzilla;

    @NotNull
    private String platforms;

    @NotNull
    private Set<Release> releases;

    @JsonProperty("not_maintained_since")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate notMaintainedSince;

    @NotNull
    @Positive
    private Integer phase;

    public Long getBu() {
        return bu;
    }

    public void setBu(Long bu) {
        this.bu = bu;
    }

    public String getBuShortname() {
        return buShortname;
    }

    public void setBuShortname(String buShortname) {
        this.buShortname = buShortname;
    }

    public String getBuName() {
        return buName;
    }

    public void setBuName(String buName) {
        this.buName = buName;
    }

    public String getProductGroupName() {
        return productGroupName;
    }

    public void setProductGroupName(String productGroupName) {
        this.productGroupName = productGroupName;
    }

    public String getBugzilla() {
        return bugzilla;
    }

    public void setBugzilla(String bugzilla) {
        this.bugzilla = bugzilla;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Set<Release> getReleases() {
        return Collections.unmodifiableSet(releases);
    }

    public void setReleases(Set<Release> releases) {
        this.releases = releases;
    }

    public LocalDate getNotMaintainedSince() {
        return notMaintainedSince;
    }

    public void setNotMaintainedSince(LocalDate notMaintainedSince) {
        this.notMaintainedSince = notMaintainedSince;
    }

    public Integer getPhase() {
        return phase;
    }

    public void setPhase(Integer phase) {
        this.phase = phase;
    }
}
