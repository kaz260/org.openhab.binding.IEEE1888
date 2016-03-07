<h1 class="gh-header-title instapaper_title">IEEE1888 Binding</h1>
Documentaion of the IEEE1888 Binding Bundle

<h2><a id="user-content-introduction" class="anchor" href="#introduction" aria-hidden="true"><span class="octicon octicon-link"></span></a>Introduction</h2>
The openHAB IEEE1888 binding allows to connect to IEEE1888 Building Automation equipments. IEEE1888 is a standardized facility infromation access protocol. Its specification is in http://www.iso.org/iso/catalogue_detail.htm?csnumber=67485

<h2><a id="user-content-configuration" class="anchor" href="#configuration" aria-hidden="true"><span class="octicon octicon-link"></span></a>Configuration</h2>
<pre><code># ieee1888:trapTimeOut=&lt;time in milliseconds&gt;
This IEEE1888 binding uses axis2 service implemented on openHAB, then its IP address and port number are 
same as those of openHAB itself.

#IEEE1888 temperature sensor, for example
ieee1888:trapTimeOut=60000
</code></pre>

<h2><a id="user-content-items" class="anchor" href="#items" aria-hidden="true"><span class="octicon octicon-link"></span></a>Items</h2>
<pre><code>
#IEEE1888 light switch, for example
Number  Building_7F_Light_SW

Building_7F_Light_SW is coresspond with point id "http://Building/7F/Light_SW".
</code></pre>

openhab.cfg
<pre><code>
ieee1888:trapTimeOut=&lt;time in milliseconds&gt;
</code></pre>
Items
<pre><code>
Number  Osaka_7F_Light_SW
Number  Osaka_7F_HVAC_SW
Number  Osaka_7F_HVAC_TEMP
</code></pre>
Sitemaps
<pre><code>
Switch 		item=Osaka_7F_Light_SW
Switch 		item=Osaka_7F_HVAC_SW
Setpoint	item=Osaka_7F_HVAC_TEMP	minValue=10 maxValue=40 step=1
</code></pre>
Sample clent
<pre><code>
hvac_sw.py is a simple IEEE1888 client using Python. if Items is defined below;
Switch  item=Osaka_7F_Light_SW  &lt;other item definition&gt;
The client send point id "http://osaka/7F/Light_SW" with point value "30", then point value "30" 
is passed to other item.
</code></pre>
<h2><a id="user-content-items" class="anchor" href="#install" aria-hidden="true"><span class="octicon octicon-link"></span></a>Install</h2>
<pre><code>
IEEE1888 binding needs axis2. After download axis2-1.6.2-src.zip in axis2 home page.
&gt;unzip axis2-1.6.2-src.zip
&gt;mv axis2-1.6.2-src 
&gt;cd axis2-1.6.2-src/modules/osgi
&gt;mvn clean install -Dmaven.test.skip=true

Download org.apache.axis2.osgi.lib.zip.
&gt;unzip org.apache.axis2.osgi.lib.zip
&gt;cd org.apache.axis2.osgi.lib
&gt;mvn clean install
&gt;mv target/org.apache.axis2.osgi.lib-1.8.0-SNAPSHOT.jar "your openHAB addons directory"

Download org.apache.axis2.osgi.zip.
&gt;unzip org.apache.axis2.osgi.zip
&gt;cd org.apache.axis2.osgi
&gt;cp axis2-1.6.2-src/modules/osgi/target/org.apache.axis2.osgi-1.6.2.jar ..
&gt;mv org.apache.axis2.osgi "your openHAB source bunbles/binding directory"

Download org.openhab.binding.IEEE1888.zip
&gt;unzip org.openhab.binding.IEEE1888.zip
&gt;mv org.openhab.binding.IEEE1888 "your openHAB source bunbles/binding directory"
&gt;mvn clean install -Dmaven.test.skip=true
&gt;mv target/org.openhab.binding.IEEE1888.jar "your openHAB addons directory"

#NOTE
If IEEE1888 client refer wsdl, you should invoke java with "org.osgi.service.http.port" option.
java ... -Dorg.osgi.service.http.port=%HTTP_PORT% ...
