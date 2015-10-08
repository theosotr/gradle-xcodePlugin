package org.openbakery

/**
 * Created by rene on 08.10.15.
 */


class BuildSettings {
	String infoplist
	String bundleIdentifier
	String productName
	String sdkRoot
	Devices devices

	BuildSettings parent;

	public BuildSettings() {
	}

	public BuildSettings(BuildSettings parent) {
		this.parent = parent;
	}

	String getInfoplist() {
		if (infoplist != null) {
			return infoplist
		}
		if (parent != null) {
			return parent.infoplist
		}
		return null
	}

	String getBundleIdentifier() {
		if (bundleIdentifier != null) {
			return bundleIdentifier
		}
		if (parent != null) {
			return parent.bundleIdentifier
		}
		return null
	}

	String getProductName() {
		if (productName != null) {
			return productName;
		}
		if (parent != null) {
			return parent.productName
		}
		return null
	}

	String getSdkRoot() {
		if (sdkRoot != null) {
			return sdkRoot
		}
		if (parent != null) {
			return parent.sdkRoot
		}
		return null
	}
}

class BuildConfiguration {

	BuildSettings debug
	BuildSettings release


}

