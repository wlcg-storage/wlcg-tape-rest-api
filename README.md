# WLCG Tape REST API

This repository hosts the WLCG Tape REST API specification.

The Tape Rest API was developed by a consortium of
Grid Storage providers (dCache, EOS/CTA, StoRM) and Grid clients (FTS & Gfal2).
The goal is to provide a simple and uniform specification for tape operations over HTTP.
Authorization methods supported are x509 proxy certificates and WLCG JWT tokens.

Ultimately, this new tape protocol would replace SRM and the XRootd staging extension.

### Timeline

The first version of the Tape REST API was released in May 2022. Since then, a gradual adoption process
has started throughout the WLCG, with the earliest sites making it available in December 2022.

As the specification evolves, this repository should serve as a documentation and discussion place.

### Archive Metadata

There is a similar activity targeting `Archive Metadata`, which is focused on providing a uniform way
for experiment frameworks to send archive metadata to the Tape Storage via the Transfer clients (FTS & Gfal2).
Although not directly related to the Tape REST API, this repository will also document
the forwarding of archive metadata.

### Useful links

- [DOMA-BDT][1]: Working group focused on Bulk Data Transfers within the Grid
- [DOMA-BDT Tape REST API][2]: Documentation of the Tape REST API on the DOMA-BDT Twiki
- [HTTP-TPC Specification][3]: Specification for the HTTP ThirdPartyCopy


[1]: https://twiki.cern.ch/twiki/bin/view/LCG/BulkDataTransfers
[2]: https://twiki.cern.ch/twiki/bin/view/LCG/TapeRestAPI
[3]: https://twiki.cern.ch/twiki/bin/view/LCG/HttpTpcTechnical
