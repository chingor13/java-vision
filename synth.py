# Copyright 2018 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

"""This script is used to synthesize generated parts of this library."""

import synthtool as s
import synthtool.gcp as gcp
import synthtool.languages.java as java

gapic = gcp.GAPICGenerator()

service = 'vision'
versions = ['v1']#, 'v1p1beta1', 'v1p2beta1', 'v1p3beta1', 'v1p4beta1']
config_pattern = '/google/cloud/vision/artman_vision_{version}.yaml'

for version in versions:
    java.gapic_library(
        service=service,
        version=version,
        config_pattern=config_pattern,
        gapic=gapic,
    )

common_templates = gcp.CommonTemplates()
templates = common_templates.java_library()
s.copy(templates, excludes=[
  'README.md',
])